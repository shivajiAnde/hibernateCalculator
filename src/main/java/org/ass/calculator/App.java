package org.ass.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.ass.calculator.dto.UserDto;
import org.ass.calculator.entity.AirHosters;
import org.ass.calculator.entity.Answer;
import org.ass.calculator.entity.Brand;
import org.ass.calculator.entity.Captain;
import org.ass.calculator.entity.City;
import org.ass.calculator.entity.Emp;
import org.ass.calculator.entity.Flight;
import org.ass.calculator.entity.Product;
import org.ass.calculator.entity.Project;
import org.ass.calculator.entity.Question;
import org.ass.calculator.entity.Student;
import org.ass.calculator.entity.Team;
import org.ass.calculator.entity.UserEntity;
import org.ass.calculator.repository.AssociationRepository;
import org.ass.calculator.repository.EmployeeRepository;
import org.ass.calculator.repository.QuestionHql;
import org.ass.calculator.repository.QuestionRepository;
import org.ass.calculator.repository.RepositoryBrand;
import org.ass.calculator.repository.UserHqlRepository;
import org.ass.calculator.repository.UserRepository;
import org.ass.calculator.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.engine.profile.Association;

public class App {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("shivaji");
		student.setMarks(70);
		City city = new City();
		city.setCityName("kadapa");
		city.setPinCode(516172);
		
		student.setCity(city);
		
		AssociationRepository repository = new AssociationRepository();
		repository.saveStudentDetails(student);
	
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		UserHqlRepository hqlRepository = new UserHqlRepository();
//		List<UserEntity> list = hqlRepository.pagination();
//		for(UserEntity u:list) {
//			System.out.println(u);
//		}
		
//		QuestionHql hql=new QuestionHql();
//		List<Object[]> list = hql.innerQuery();
//		for(Object[] c:list) {
//			System.out.println(Arrays.toString(c));
//		}
		
		
//		Question question = new Question();
//		question.setQuestion("git hub");
//		
//		Answer answer = new Answer();
//		answer.setAnswer("container where we store the data");
//		
//		Answer answer2 = new Answer();
//		answer2.setAnswer("data may be a project or a simple information");
//		
//		List<Answer> list1=new ArrayList<>();
//		list1.add(answer);
//		list1.add(answer2);
//		
//		question.setAnswers(list1);
//		QuestionRepository repository = new QuestionRepository();
//		repository.saveOrUpdate(question);
//		

//    	Team team = new Team();
//    	team.setName("foot ball");
//    	team.setTeamSize("11");
//    	team.setTeamType("game");
//    	Captain captain = new Captain();
//    	captain.setAge("37");
//    	captain.setCaptainName("sunil Chettri");
//    	captain.setEmail("football@gmail.com");
//    	team.setCaptain(captain);
//    	AssociationRepository repository = new AssociationRepository();
//    	
//    	repository.saveTeamDetails(team);
//    	
//    	Team team2 = new Team();
//    	team2.setName("hockey");
//    	team2.setTeamSize("11");
//    	team2.setTeamType("game");
//    	Captain captain2 = new Captain();
//    	captain2.setAge("32");
//    	captain2.setCaptainName("manpreet singh");
//    	captain2.setEmail("hockey@gmail.com");
//    	team2.setCaptain(captain2);
//    	
//    	repository.saveTeamDetails(team2);
//    	
//    	repository.delete(4);
//    	repository.delete(5);
//    	repository.delete(6);
//    	
//    	

//    	Question  question=new Question();
//    	question.setQuestionId(1);
//    	question.setQuestion("what is java");
//    	
//    	Answer answer=new Answer();
//    	answer.setAnswerId(101);
//    	answer.setAnswer("java is a programming language");
//    	question.setAnswer(answer);
//    	System.out.println("done");
//    	
//    	QuestionRepository repository = new QuestionRepository();
//    	repository.saveOrUpdate(question);
//    	
//    	Question question2 = new Question();
//    	question2.setQuestion("what is collectionn framework");
//    	question2.setQuestionId(2);
//    	Answer answer2 = new Answer();
//    	answer2.setAnswerId(201);
//    	answer2.setAnswer("it is an api used to work with bulk of objects");
//    	question2.setAnswer(answer2);
//    	
//    	repository.saveOrUpdate(question2);
//    	
//    	repository.delete(0);
//    	Question question3 = new Question();
//    	question3.setQuestion("what is sql");
//    	question3.setQuestionId(3);
//    	Answer answer3 = new Answer(); 
//    	answer3.setAnswerId(103);
//    	answer3.setAnswer("it is a structred query language");
//    	question3.setAnswer(answer3);
//    	repository.saveOrUpdate(question3);
//    	

//    	RepositoryBrand rb=new RepositoryBrand();
//    	Product p1 = new Product();
//    	p1.setProductName("curd");
//    	Product p2 = new Product();
//    	p2.setProductName("milk");
//    	Product p3 = new Product();
//    	p3.setProductName("ghee");
//    	
//    	ArrayList<Product> product=new ArrayList<Product>();
//    	product.add(p1);
//    	product.add(p2);
//    	product.add(p3);
//    	
//    	Brand b1=new Brand();
//    	b1.setBrand("amul");
//  
//    	
//    	Brand b2=new Brand();
//    	b1.setBrand("dodla");
//    	
//    	Brand b3=new Brand();
//    	b1.setBrand("amruth");
//    	
//    	ArrayList<Brand> brands=new ArrayList<Brand>();
//    	brands.add(b1);
//    	brands.add(b2);
//    	brands.add(b3);
//    	
//    	b1.setProduct(product);
//    	p1.setBrand(brands);
//    	rb.saveBrands(brands); 
//    	rb.saveProduct(product);
		
		
		
		
//		Brand b=new Brand();
//    	Brand b1 = new Brand();
//    	Product p = new Product();
//    	Product p1=new Product();
//    	
//    	b.setBrand("amul");
//    	
//    	b1.setBrand("dodla");
//    	
//    	p.setProductName("milk");
//    	
//    	p1.setProductName("curd");
//		
//		List<Brand> brand=new ArrayList<>();
//		brand.add(b);
//		brand.add(b1);
//		
//		List<Product> product=new ArrayList<>();
//		product.add(p1);
//		product.add(p);
//		
//		b.setProduct(product);
//		p1.setBrand(brand);
//		
//		RepositoryBrand repositoryBrand = new RepositoryBrand();
//		repositoryBrand.saveBrands(b);
//		repositoryBrand.saveBrands(b1);
//		repositoryBrand.saveProduct(p);
//		repositoryBrand.saveProduct(p1);
		
		
		
		
		
		
//		
//		Emp e = new Emp();
//		Emp e1 = new Emp();
//		Project p=new Project();
//		Project p1=new Project();
//		e.setEid(12);
//		e.setName("shivaji");
//		e1.setEid(13);
//		e1.setName("hari");
//		
//		p.setPid(21);
//		p.setProjectName("todo project");
//		p1.setPid(22);
//		p.setProjectName("dbms");
//		
//		List<Emp> emps=new ArrayList<>();
//		emps.add(e);
//		emps.add(e1);
//		
//		List<Project> proj=new ArrayList<>();
//		proj.add(p);
//		proj.add(p1);
//		
//		e.setProjects(proj);
//		p1.setEmps(emps);
//		
//		EmployeeRepository er=new EmployeeRepository();
//		er.saveEmp(e);
//		er.saveEmp(e1);
//		
//		er.saveProduct(p);
//		er.saveProduct(p1);
//		
//    	UserEntity userEntity = new UserEntity();
//    	userEntity.setAltkey(124);
//    	userEntity.setName("Raveesh new");
//    	userEntity.setEmail("abhiroyalande");
//    	userEntity.setPassword("shivaji");
//    	userEntity.setCity("banglore");
//    	userEntity.setCountry("india");
//    	userEntity.setPincode("3331");
//    	userEntity.setContactnumber("9346818421");
//    	
//    	UserRepository repository=new UserRepository();
//    	UserDto userDto=new UserDto();
//    	userDto.setAltkey(123);
//    	userDto.setName("sandeep royal");
//    	userDto.setCity("Andhra pradesh");
//    	userDto.setCountry("India");
//    	userDto.setPincode("516172");
//    	repository.save(userEntity);
//    	repository.update(userDto); 
//    	repository.delete(userDto);
//    	UserEntity entity=repository.findById(123);
//    	
//    	System.out.println(entity);
//    	UserHqlRepository hqlRepository = new UserHqlRepository();
//    	hqlRepository.updatePasswordByEmail("shivaji!&","abhiroyalande");
//    	hqlRepository.deleteUserByName("Raveesh new");
//    	List<UserEntity> list = hqlRepository.findAll();	
//    	list.forEach(each->{
//    		System.out.println(each);
//    	});

		/*
		 * List<UserEntity> list2 =
		 * list.stream().filter(e->e.getName().equalsIgnoreCase("Abhijeet")).collect(
		 * Collectors.toList());
		 * 
		 * list2.forEach(e->{ System.out.println(e); }); List<UserEntity> findByName =
		 * hqlRepository.findByName("Abhijeet"); findByName.forEach(each->{
		 * System.out.println(each); });
		 */

		/*
		 * Team team=new Team(); team.setAltkey(1); team.setName("Indian cricket");
		 * team.setTeamSize("11"); team.setTeamType("cricket"); Captain cap=new
		 * Captain(); cap.setCaptainName("Virat Kohli"); cap.setAge("34");
		 * cap.setEmail("rcb@gmail.com"); AssociationRepository associateRepository=new
		 * AssociationRepository(); associateRepository.saveTeamDetails(team);
		 */

		
//		  AirHosters airHosters = new AirHosters(); 
//		  airHosters.setName("lotus");
//		  airHosters.setAge(23);
//		  
//		  AirHosters airHosters1 = new AirHosters(); 
//		  airHosters1.setName("malleshwari");
//		  airHosters1.setAge(25);
//		  
//		  AirHosters airHosters2 = new AirHosters();
//		  airHosters2.setName("pv Sindhu");
//		  airHosters2.setAge(28);
//		 
//		  ArrayList<AirHosters> arrayList=new ArrayList<AirHosters>();
//		  arrayList.add(airHosters); arrayList.add(airHosters1);
//		  arrayList.add(airHosters2);
//		  
//		  Flight flight=new Flight(); flight.setName("indigo"); flight.setPrice(500.0);
//		  flight.setNoOfSeats(100); flight.setAirhosters(arrayList);
//		  AssociationRepository repository = new AssociationRepository();
//		  repository.saveFlightDetails(flight);
		
	}
}
