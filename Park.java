public class Park {
    public class Attractions{
        private String title;
        private String workingHours;
        private float cost;

        public Attractions (String title, String workingHours, float cost){
            this.title = title;
            this.workingHours = workingHours;
            this.cost = cost;
        }
        public String getTitle(){
            return title;
        }
        public String getWorkingHours(){
            return workingHours;
        }
        public float getCost(){
            return cost;
        }


    }
}
