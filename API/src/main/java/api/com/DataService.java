package api.com;

import java.util.ArrayList;
import java.util.List;

public class DataService 
{
	 private List<Doctors> doctor = new ArrayList<Doctors>();
	 private List<Clinic> clinic = new ArrayList<Clinic>();
	 private static DataService ourInstance = new DataService();
	 public static DataService getInstance() 
	 {
	        return ourInstance;
	 }
	 public CheckDoctors doctor(Doctors doctors) 
	 {
		 Doctors doctors1=new Doctors();
		 doctors1.setId("1");
		 doctors1.setName("Dr Viral Vyas");
		 doctors1.setRegistrationno("94561902");
		 doctors1.setPractice("M.D,Physician");
		 doctors1.setInstitute("Medical Institute");
		 doctors1.setExperience("12yrs");
		 doctors1.setQualification("M.B.B.S");
		 doctors1.setPhone("123456789");
		 doctors1.setProcurement("2018");
		 doctors1.setOverview("Doctor with great experience");
		 doctors1.setStatus("today");
		 doctors1.setImg("image2.jpg");
		 doctors1.setOngoingpatient("12+");
		 doctors1.setTreatedpatient("13+");
		 doctor.add(doctors);
		 String newID=Integer.toString(doctor.size()+1);
		 doctors.setId(newID);
	 	 CheckDoctors insert=new CheckDoctors();
	 	 doctor.add(doctors);
	 	 insert.setData(doctor);
	 	 insert.setMessage("success");
	 	 insert.setStatus("200");
		 return insert;
	 }

	  public CheckDoctors getdoctors() 
	  {
		     CheckDoctors insert=new CheckDoctors();
		     insert.setData(doctor);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
	  }
	  public CheckDoctors getdoctorbyid(String id)
	  {
	        for (Doctors doctors : doctor) 
	        {
	            if (doctors.getId().equals(id)) {
	            	
	            	 List<Doctors> getbyid=new ArrayList<Doctors>();
		             getbyid.add(doctors);
		             CheckDoctors insert=new CheckDoctors();
		   		     insert.setData(getbyid);
		   		 	 insert.setMessage("success");
		   		 	 insert.setStatus("200");
		   			 return insert;
		         }
	            else
	            {
	            	 CheckDoctors insert=new CheckDoctors();
		   		     insert.setData(null);
		   		 	 insert.setMessage("No such data in lists");
		   		 	 insert.setStatus("404");
		   			 return insert;
	            }
	               
	        }

	        return null;
	  }
	  
	  public CheckClinic clinic(Clinic clinics)
	  {
		 
		  	 Clinic clinic1=new Clinic();
		  	 clinic1.setId("1");
		  	 clinic1.setClinicname("shreenathji");
		  	 clinic1.setRegistrationno("1234");
		  	 clinic1.setLocation("malad");
		  	 clinic1.setAadharcard("123456789");
		  	 clinic1.setEmailid("jinal@gmail.com");
		  	 clinic1.setQualificationname("MBA");
		  	 clinic1.setPhoneNumber("1234567890");
		  	 clinic1.setInstitutename("abc");
		  	 clinic1.setClinictype("dental");
		  	 clinic1.setProcurementyear("2020");
		  	 clinic1.setYearsofpractice("12years");
		  	 clinic1.setAssociatedfacilites("abx");
		  	 clinic1.setClinicregistration("link");
		  	 clinic1.setDocname("abc");
		  	 clinic.add(clinic1);
		  	 String newID=Integer.toString(clinic.size()+1);
			 clinics.setId(newID);
		 	 CheckClinic insert=new CheckClinic();
		 	 clinic.add(clinics);
		 	 insert.setData(clinic);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
	  }
	  
	  
	   public CheckClinic getcliniclist() 
	   {
		     CheckClinic insert=new CheckClinic();
		     insert.setData(clinic);
		 	 insert.setMessage("success");
		 	 insert.setStatus("200");
			 return insert;
	   }
	 
	   public CheckClinic getClinicById(String id)
		 {
		        for (Clinic register : clinic) {
		            if (register.getId().equals(id)) 
		            {
		                
		            	 List<Clinic> getbyid=new ArrayList<Clinic>();
			             getbyid.add(register);
			             CheckClinic insert=new CheckClinic();
			   		     insert.setData(getbyid);
			   		 	 insert.setMessage("success");
			   		 	 insert.setStatus("200");
			   			 return insert;
		              }
		            else
		            {
		            	 CheckClinic insert=new CheckClinic();
			   		     insert.setData(null);
			   		 	 insert.setMessage("No such data in list");
			   		 	 insert.setStatus("404");
			   			 return insert;	
		            }
		        }
	
		        return null;
		 }
		 public CheckClinic getdeleteclinic(String id) 
		 {
		        for (Clinic clinics : clinic) {
		            if (clinics.getId().equals(id))
		            {
						 clinic.remove(clinics);
						 CheckClinic insert=new CheckClinic();
			   		     insert.setData(clinic);
			   		 	 insert.setMessage("success");
			   		 	 insert.setStatus("200");
			   		     return insert;
					 }
		            else
		            {
		            	 CheckClinic insert=new CheckClinic();
			   		     insert.setData(null);
			   		 	 insert.setMessage("No such data in list");
			   		 	 insert.setStatus("404");
			   		     return insert;
		            }
		        }
				return null;
		       
		    }
		 public CheckClinic updateclinicdetails(String id,String clinicname, String registrationno, String location
				    ,String aadharcardno,String emailid,String qualificationname,String phoneno,String institutename,
				    String clinictype,String procurementyear,String yearsofpractice,String associatedfacilites,
				    String clinicregistration,String docname)
		 {
			 for (Clinic cd : clinic) { 
		            if (cd.getId().equals(id)) 
		            {
		            	cd.setClinicname(clinicname);
		            	cd.setRegistrationno(registrationno);
		            	cd.setLocation(location);
				        cd.setAadharcard(aadharcardno);
				        cd.setEmailid(emailid);
				        cd.setQualificationname(qualificationname);
				        cd.setPhoneNumber(phoneno);
				        cd.setInstitutename(institutename);
				        cd.setClinictype(clinictype);
				        cd.setProcurementyear(procurementyear);
				        cd.setYearsofpractice(yearsofpractice);
				        cd.setAssociatedfacilites(associatedfacilites);
				        cd.setClinicregistration(clinicregistration);
				        cd.setDocname(docname);
				        
				         List<Clinic> getbyid=new ArrayList<Clinic>();
			             getbyid.add(cd);
			             CheckClinic insert=new CheckClinic();
			   		     insert.setData(getbyid);
			   		 	 insert.setMessage("success");
			   		 	 insert.setStatus("200");
			   		    return insert;
			                  }
			 }
			return null;
		 }
		 
		 
}
