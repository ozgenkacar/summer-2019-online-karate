import com.intuit.karate.junit5.Karate;

class FeatureRunner {
    
    @Karate.Test
    Karate testUsers() {
//        return new Karate().feature("my.feature").relativeTo(getClass());
        return new Karate().tags("@bookit").relativeTo(getClass());
    }

    @Karate.Test
    Karate metaWeatherTests(){
        return new Karate().tags("@meta_weather").relativeTo(getClass());
    }
}
