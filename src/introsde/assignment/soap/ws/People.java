package introsde.assignment.soap.ws;
import introsde.assignment.soap.model.*;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.WebResult;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public interface People {
  @WebMethod(operationName="getPeopleList")
  @WebResult(name="people")
  public List<Person> getPeople();
  
  @WebMethod(operationName="readPerson")
  @WebResult(name="person") 
  public Person readPerson(@WebParam(name="personId") int id);

  @WebMethod(operationName="updatePerson")
  @WebResult(name="updatedPerson")
  public Person updatePerson(@WebParam(name="personId") int id, @WebParam(name="person") Person person);

  @WebMethod(operationName="createPerson")
  @WebResult(name="createdPerson")
  public Person createPerson(@WebParam(name="person") Person person);

  @WebMethod(operationName="deletePerson")
  public void deletePerson(@WebParam(name="personId") int id);

  @WebMethod(operationName="getPersonHistory")
  @WebResult(name="measures")
  public List<Measure> getPersonHistory(@WebParam(name="personId") int id, @WebParam(name="measureType") String measureType);

  @WebMethod(operationName="getMeasureTypes")
  @WebResult(name="measureTypes")
  public List<MeasureType> getMeasureTypes();

  @WebMethod(operationName="getMeasure")
  @WebResult(name="measure")
  public Measure getMeasure(@WebParam(name="measureId") int id);
}