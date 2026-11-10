ALTER TABLE java_store.products
    ADD `description` TEXT NULL;

ALTER TABLE java_store.products
    MODIFY `description` TEXT NOT NULL;