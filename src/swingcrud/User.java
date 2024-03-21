package swingcrud;

/**
 *
 * @author JAMES
 */
public class User {
    String fname,lname,id;
    public User(String fname,String lname,String id){
        this.fname = fname;
        this.lname = lname;
        this.id = id;
    }
    
    //getters
    public String getLname(){
        return this.lname;
    }
    public String getFname(){
        return this.fname;
    }
    public String getId(){
        return this.id;
    }
    
}
