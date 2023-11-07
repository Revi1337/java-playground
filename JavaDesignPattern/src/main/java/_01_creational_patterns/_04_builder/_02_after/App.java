package _01_creational_patterns._04_builder._02_after;


public class App {

    public static void main(String[] args) {
        // TODO Builder 사용
//        TourPlanBuilder tourPlanBuilder = new DefaultTourBuilder();
//        TourPlan plan = tourPlanBuilder.title("칸쿤 여행")
//                .nightsAndDays(2, 3)
//                .startDate(LocalDate.of(2023, 10, 9))
//                .whereToStay("리조트")
//                .addPlan(0, "체크인하고 짐 풀기")
//                .addPlan(0, "저녁 식사")
//                .getPlan();
//
//        TourPlan plan2 = tourPlanBuilder.title("롱비치")
//                .startDate(LocalDate.of(2021, 7, 15))
//                .getPlan();

        // TODO 동일한 Builder 프로세스가 반복되면 Director 이용
        TourPlanBuilder defaultTourBuilder = new DefaultTourBuilder();
        TourDirector tourDirector = new TourDirector(defaultTourBuilder);
        TourPlan longBeachTrip = tourDirector.longBeachTrip();
        TourPlan cancunTrip = tourDirector.cancunTrip();
        System.out.println("cancunTrip = " + cancunTrip);
        System.out.println("longBeachTrip = " + longBeachTrip);

    }
}
