import java.util.ArrayList;
import java.util.List;

public class AmazonQuestion2 {
	
	static class Request{
		String emp_name;
		int from_building;
		int to_building;
	}
	
	public List<List<String>> getExchangeList(List<Request> request){
		List<List<String>> list = new ArrayList<>();
		List<String> list1= new ArrayList<>();
		for(int i=0;i<request.size();i++) {
			if(request.get(i).to_building==request.get(i+1).from_building) {
			   list1.add(request.get(i).emp_name);
			   list1.add(request.get(i+1).emp_name);
			   
			   list.add(list1);
			}
			
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
