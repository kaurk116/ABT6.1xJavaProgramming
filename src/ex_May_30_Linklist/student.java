package ex_May_30_Linklist;

public class student implements Comparable<student> {



    public student(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        Integer id;
        String name;


        public Integer getId () {
            return id;
        }

        public void setId (Integer id){
            this.id = id;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }


  public Integer CompareTo(student o){
            return Integer.compare(this.id,o.id);

  }
  public  int Compareto(student o){
            return CharSequence.compare(this.name,o.name);
  }


    @Override
    public int compareTo(student o) {
        return 0;
    }
}
