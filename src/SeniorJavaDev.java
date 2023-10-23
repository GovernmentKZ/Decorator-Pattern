public class SeniorJavaDev extends DevDecarator{
    public SeniorJavaDev(Developer developer) {
        super(developer);
    }
    public String makeCodeReview(){
        return "Make Code Review";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
