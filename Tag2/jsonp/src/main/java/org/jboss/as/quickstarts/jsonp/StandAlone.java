package org.jboss.as.quickstarts.jsonp;

import javax.json.Json;
import java.util.ArrayList;
import java.util.HashMap;

public class StandAlone {
    public static  void  main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("FirstElements");

        HashMap<String, Object> map = new HashMap<>();
        map.put("eins",  array);

        String jsonString = Json.createObjectBuilder(map)
                .build().toString();

        System.out.println(jsonString);
        Person person = new Person();

        System.out.println(Json.createObjectBuilder()
                .add("name", person.getName())
                .add("age", person.getAge())
                .add("enabled", person.getEnabled())
                .add("phones", Json.createArrayBuilder()
                        .add(person.getPhone1())
                        .add(person.getPhone2())
                )
                .add("address", Json.createObjectBuilder()
                        .add("street", person.getAddressStreet())
                        .add("apt", person.getAddressApt())
                        .add("city", person.getAddressCity())
                        .add("zip", person.getAddressZip())
                )
                .build().toString());

    }
}
