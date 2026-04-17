package in.reinventing.course.model.node;

public class MetaData {
    private Difficulty difficulty;
    private Duration duration;

    enum Difficulty{
        MEDIUM,
        HARD,
        EASY
    }

    static class Duration{
        private double time;
        private TimeUnit timeUnit;

        enum TimeUnit{
            SECOND,
            MINUTE,
            HOUR,
            DAY,
            MONTH,
            YEAR
        }

        public double getTime() {
            return time;
        }

        public void setTime(double time) {
            this.time = time;
        }

        public TimeUnit getTimeUnit() {
            return timeUnit;
        }

        public void setTimeUnit(TimeUnit timeUnit) {
            this.timeUnit = timeUnit;
        }
    }


}
