package cafe.jjdev.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/test")
	public A test() { //rpc의 리턴값 string, json이 문자열로 바꿈 
	//	return new String[]{"박찬업", "주선태"};
	A a = new A();
	a.x = 10;
	return a;
	}
}
