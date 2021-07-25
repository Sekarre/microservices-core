package sekarre.com.core.query;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FetchUserPaymentDetailsQuery {
    private String userId;
}
