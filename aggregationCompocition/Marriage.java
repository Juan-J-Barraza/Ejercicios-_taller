package aggregationCompocition;

public class Marriage {
    private Person person;
    private Event event;

    public Marriage(Person person, Event event) {
        this.person = person;
        this.event = event;
    }

    public void show(){
        System.out.println("person is: " + person.getName() + "and event is: " + event.getName());
    }
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }    
}
