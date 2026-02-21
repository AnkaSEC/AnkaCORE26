package   importKonu;

//import Metodlar.ornek.Menu;  // birinci kullanım

import Metodlar.ornek.Menu;

import static Metodlar.ornek.Menu.*;// üçüncü kullanım * ile tüm Menu clasındaki metodları çağırır

//import static Metodlar.ornek.Menu.*;



public class statickullanim {
    public static void main(String[] args) {

      Menu.calistir(); // birinci kullanım
         calistir();  // ikinci kullanım
        staticCagir();// üçüncü kullanım
    }
}
