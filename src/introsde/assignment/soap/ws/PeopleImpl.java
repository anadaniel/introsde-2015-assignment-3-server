package introsde.assignment.soap.ws;
import introsde.assignment.soap.model.*;

import java.util.List;
import javax.jws.WebService;

//Service Implementation

@WebService(endpointInterface = "introsde.assignment.soap.ws.People", serviceName="PeopleService")
public class PeopleImpl implements People {

  @Override
  public List<Person> getPeople() {
    return Person.getAll();
  }

  @Override
  public Person readPerson(int id) {
    return Person.getPersonById(id);
  }

  @Override
  public Person updatePerson(int id, Person person) {
    Person old_person = Person.getPersonById(id);
    if (old_person != null)
      return Person.updatePerson(old_person, person);
    else
      return old_person;
  }

  @Override
  public Person createPerson(Person person) {
    return Person.createPerson(person);
  }

  @Override
  public void deletePerson(int id) {
    Person person = Person.getPersonById(id);
    Person.deletePerson(person);
  }

  @Override
  public List<Measure> getPersonHistory(int id, String measureType) {
    return Measure.getMeasuresFromPerson(id, measureType);
  }

  @Override
  public List<MeasureType> getMeasureTypes() {
    return MeasureType.getAll();
  }

  @Override
  public Measure getMeasure(int measureId) {
    return Measure.getMeasureById(measureId);
  }

  @Override
  public Measure createMeasure(Measure measure, int personId, String measureType) {
    return Measure.createMeasure(measure, personId, measureType);
  }

  @Override
  public Measure updateMeasure(int id, Measure measure) {
    Measure old_measure = Measure.getMeasureById(id);
    if (old_measure != null)
      return Measure.updateMeasure(old_measure, measure);
    else
      return old_measure;
  }
}