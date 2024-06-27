package co.moonforest.mscustomer.core.domain;

public abstract class Entity<ID> {
    private ID id;

    protected void setId(ID id) {
        this.id = id;
    }

    public final ID getId() {
        return id;
    }
}
