public class DevDecarator implements Developer{

    Developer developer;

    public DevDecarator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
