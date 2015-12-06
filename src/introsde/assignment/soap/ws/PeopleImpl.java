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

  // @Override
  // public int addPerson(Person person) {
  //   Person.savePerson(person);
  //   return person.getIdPerson();
  // }

  // @Override
  // public int updatePerson(Person person) {
  //   Person.updatePerson(person);
  //   return person.getIdPerson();
  // }

  // @Override
  // public int deletePerson(int id) {
  //   Person p = Person.getPersonById(id);
  //   if (p!=null) {
  //     Person.removePerson(p);
  //     return 0;
  //   } else {
  //     return -1;
  //   }
  // }

  // @Override
  // public int updatePersonHP(int id, LifeStatus hp) {
  //   LifeStatus ls = LifeStatus.getLifeStatusById(hp.getIdMeasure());
  //   if (ls.getPerson().getIdPerson() == id) {
  //     LifeStatus.updateLifeStatus(hp);
  //     return hp.getIdMeasure();
  //   } else {
  //     return -1;
  //   }
  // }
}