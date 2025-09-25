-- // create_cave_table
-- Migration SQL that makes the change goes here.
CREATE SCHEMA prehistoric;

-- Manually setting `updated_at` is error prone. 
-- Ideally, we can use a database trigger to keep it up to date automatically.

-- First, create a function in the schema that sets a row's updated_at to the current time
CREATE FUNCTION prehistoric.set_current_timestamp_updated_at()
RETURNS TRIGGER AS $$
DECLARE
  _new record;
BEGIN
  _new := NEW;
  _new."updated_at" = NOW();
  RETURN _new;
END;
$$ LANGUAGE plpgsql;

CREATE TABLE prehistoric.cave(
  id uuid NOT NULL DEFAULT gen_random_uuid() primary key,
  created_at timestamptz NOT NULL DEFAULT now(),
  updated_at timestamptz NOT NULL DEFAULT now(),
  description text
);

-- Create the trigger that calls the fn to set the updated_at timestamp
CREATE TRIGGER set_prehistoric_cave_updated_at
BEFORE UPDATE ON prehistoric.cave
FOR EACH ROW
EXECUTE PROCEDURE prehistoric.set_current_timestamp_updated_at();


-- //@UNDO
-- SQL to undo the change goes here.
DROP TABLE prehistoric.cave;
DROP FUNCTION prehistoric.set_current_timestamp_updated_at;
DROP SCHEMA prehistoric;


