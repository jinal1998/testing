package api.com;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;





@Path("/")
public class BaseClassApi 
{
	List<String> empty = new ArrayList<>();
	private DataService dataService = DataService.getInstance();
	@POST
	@Path("doctor")
    @Consumes(MediaType.APPLICATION_JSON)
 	@Produces(MediaType.APPLICATION_JSON)
 	public Response getdoctors(Doctors doctor)
 	{
 		return Response.status(200).entity(dataService.doctor(doctor)).build();
 	}
	
	 @GET
	 @Path("doctor")
     @Produces(MediaType.APPLICATION_JSON)
     public CheckDoctors getdoctors() {
         return dataService.getdoctors();
     }
     
	 @GET
	 @Path("doctor/{doctorid}")
	 @Produces(MediaType.APPLICATION_JSON)
	 public Response getdoctor(@PathParam("doctorid") String id) {
	        CheckDoctors doctor = dataService.getdoctorbyid(id);
	        if (doctor == null) {
	        	 return Response
	   			      .status(Response.Status.NOT_FOUND).entity(dataService.getdoctorbyid(id))
	   			      .build();
	        } else {
	            return Response.ok()
	                           .entity(doctor)
	                           .build();
	        }
	    }
	
	 @GET
	 @Path("onboarding")
	 @Produces(MediaType.APPLICATION_JSON)
	 public CheckOnboarding getonboardingesponse() {
		 
		 	CheckOnboarding onboard=new CheckOnboarding();
		 	
		try
		{
			List<Onboarding> onboarding = new ArrayList<Onboarding>();
			
			Onboarding obj=null;
			obj=new Onboarding();
			obj.setTitle("Visual EMR  previous data");
			obj.setDescription("Get access to patient EMR from their previous consultation");
			obj.setImage("preview.jpg");
			
			Onboarding obj1=null;
			obj1=new Onboarding();
			obj1.setTitle("Manage appointments easily");
			obj1.setDescription("smart assistants prioritize appointments,facilitate consultation and schedule followups");
			obj1.setImage("images.png");
			
			Onboarding obj2=null;
			obj2=new Onboarding();
			obj2.setTitle("Seamless Data migration");
			obj2.setDescription("Access via app and web");
			obj2.setImage("preview.jpg");
			
			Onboarding obj4=null;
			obj4=new Onboarding();
			obj4.setTitle("Automate invoice and billing");
			obj4.setDescription("Leave your operation to us");
			obj4.setImage("image3.jpg");
			
			onboarding.add(obj);
			onboarding.add(obj1);
			onboarding.add(obj2);
			onboarding.add(obj4);
			
			onboard.setMessage("Success");
			onboard.setStatus("200");
			onboard.setData(onboarding);
			
			return onboard;
		}
		catch(Exception e)
		{
			onboard.setMessage(e.getMessage());
			onboard.setData(null);
			onboard.setStatus("400");
		}
		return onboard;
			 
		}
	 
	    @POST
		@Path("clinic")
	    @Consumes(MediaType.APPLICATION_JSON)
	 	@Produces(MediaType.APPLICATION_JSON)
	 	public Response getclinic(Clinic clinic)
	 	{
	    	return Response.status(200).entity(dataService.clinic(clinic)).build();
	 	}
	    
	     @GET
		 @Path("clinic")
	     @Produces(MediaType.APPLICATION_JSON)
	     public CheckClinic getclinics() {
	         return dataService.getcliniclist();
	     }
	     
	     @GET
		 @Path("clinic/{clinicid}")
		 @Produces(MediaType.APPLICATION_JSON)
		 public Response getclinicbyid(@PathParam("clinicid") String id) {
		        CheckClinic clinic = dataService.getClinicById(id);
		        if (clinic == null) {
		            return Response.status(Response.Status.NOT_FOUND).entity(dataService.getClinicById(id))
		                      .build();
		        } else {
		            return Response.ok()
		                           .entity(clinic)
		                           .build();
		        }
		    }
	     
	     @PUT
	     @Path("clinic/{clinicid}")
	     @Produces(MediaType.APPLICATION_JSON)
	     @Consumes(MediaType.APPLICATION_JSON)
	     public Response getCustomer(@PathParam("clinicid") String id,Clinic cs) {
	         CheckClinic cur = dataService.getClinicById(id);
	         if (cur == null) {
	             return Response.status(Response.Status.NOT_FOUND).entity(dataService.getClinicById(id))
	                       .build();
	         } else {
	        	 return Response.ok()
	                            .entity(dataService.updateclinicdetails(id,cs.getClinicname(),cs.getRegistrationno(),cs.getLocation(),cs.getAadharcard(),cs.getEmailid(),cs.getQualificationname(),cs.getPhoneNumber(),cs.getInstitutename(),cs.getClinictype(),cs.getProcurementyear(),cs.getYearsofpractice(),cs.getAssociatedfacilites(),cs.getClinicregistration(),cs.getDocname()))
	                            .build();
	         }
	     }
	     
	     @DELETE
	     @Path("clinic/{clinicid}")
	     @Produces(MediaType.APPLICATION_JSON)
	     @Consumes(MediaType.APPLICATION_JSON)
	     public Response getdetail(@PathParam("clinicid") String id) {
	         CheckClinic del = dataService.getdeleteclinic(id);
	         if (del == null) {
	             return Response.status(Response.Status.NOT_FOUND).entity(dataService.getClinicById(id))
	                       .build();
	         } else {
	        	 
	             return Response.ok()
	                            .entity(del)
	                            .build();
	         }
	     }
	     
	     @GET
		 @Path("paymentplans")
		 @Produces(MediaType.APPLICATION_JSON)
		 public CheckPaymentplans getpaymentplansesponse() 
	     {
	    	CheckPaymentplans plans=new CheckPaymentplans();
	    	List<Paymentplans> plan=new ArrayList<Paymentplans>();
	    	
	    	Paymentplans obj=null;
	    	obj=new Paymentplans();
	    	
	    	obj.setTitle("Basic plan rs999/month");
	    	obj.setDescription("your plan includes:1.advanced Calendar-manages appointment\"+ \"2.professional billing\"+ \"3.Unlimited appointment confirmation,reminders and followups\"+ \"4.share records with patients");
	    	obj.setImage("image2.jpg");
	    	obj.setButton1("Start your free 30day trial now");
	    	
	    	Paymentplans obj1=null;
	    	obj1=new Paymentplans();
	    	
	    	obj1.setTitle("Business plan rs1499/month");
	    	obj1.setDescription("your plan includes:1.advanced Calendar-manages appointment\"+\"2.professional billing\"+\"3.Unlimited appointment confirmation,reminders and followups\"+\"4.share records with patients\"+\"5.supports 13local languages\"+\"6.patient education tips and videos\"+\"24/7 helpdesk support");
	    	obj1.setImage("image2.jpg");
	    	obj1.setButton1("Start your free 30day trial now");
	    	
	    	plan.add(obj);
	    	plan.add(obj1);
	    	
	    	plans.setMessage("Success");
	    	plans.setStatus("200");
	    	plans.setData(plan);
	    	
	    	
			return plans;
				
		 }
		 
	     
}
