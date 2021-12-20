package Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import java.util.ArrayList;

@Builder
@Data

public class User {
    String name;
    String job;
    int id;
    @Expose
    @SerializedName("first_name")
    String firstName;
    @Expose
    @SerializedName("last_name")
    String lastName;
    String updatedAt;
    String email;
    String password;
    String token;
}
