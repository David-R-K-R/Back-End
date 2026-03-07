package exercise8;

public class Person {

    private String name;
    private Person mother;
    private Person father;

    public Person(String name, Person mother, Person father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    public boolean isSiblingOf(Person person) {
        // Return "true" if this object is the sibling of the person given as a parameter
        if (person == null || person == this) {
            return false;
        }
        return this.mother != null
                && this.father != null
                && this.mother == person.mother
                && this.father == person.father;
    }

    public boolean isGrandparentOf(Person person) {
        // Return "true" if this object is the grandparent of the person given as a parameter
        if (person == null) {
            return false;
        }
        return isParentOf(person.mother) || isParentOf(person.father);
    }

    public boolean isGrandchildOf(Person person) {
        // Return "true" if this object is the grandchild of the person given as a parameter
        if (person == null) {
            return false;
        }
        return person.isGrandparentOf(this);
    }

    private boolean isParentOf(Person person) {
        return person != null && (person.mother == this || person.father == this);
    }
}
