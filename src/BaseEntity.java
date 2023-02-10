public abstract class BaseEntity {
    protected long id;
    protected long version;


    public void setId(long id) {
        this.id = id;
    }
    public void setVersion(long version) {
        this.version = version;
    }
}
