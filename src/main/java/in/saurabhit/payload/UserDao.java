package in.saurabhit.payload;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDao {
	
private Integer id;
	
	private String name;
		
	private String email;
	private String password;
	private String about;


}
