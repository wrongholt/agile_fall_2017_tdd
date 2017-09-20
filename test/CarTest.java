import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class CarTest {

	@Test 
	public void createsCarWithSpeedOfZero() {
		Car car1 = new Car("Red", 100);
		assertThat(car1.getSpeed(), is(0));
	}
	
	@Test 
	public void canAccelerate(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(10);
		assertThat(car1.getSpeed(), is(10));
	}
	
	@Test
	public void cannotAccelerateBeyondMaxSpeed(){
		Car car1 = new Car("Red", 100);
		car1.accelerate(101);
		assertThat(car1.getSpeed(), is(100));
	}
	
	@Test 
	public void canDoToString(){
		Car car1 = new Car("Red", 100);
		assertThat(car1.toString(), is("Color: Red, Speed: 0"));
	}

	@Test
	public void canDoToStringAccountForNewInstances()
	{
		Car car2 = new Car("Blue", 250);
		assertThat(car2.toString(), is("Color: Blue, Speed: 0"));
	}
	
	@Test
	public void canDecelerate()
	{
		Car car3 = new Car("Green", 100);
		car3.accelerate(10);
		car3.decelerate(5);
		assertThat(car3.getSpeed(), is(5));
	}

	@Test
	public void canDecelerateNewInstance()
	{
		Car car4 = new Car("Yellow", 50);
		car3.accelerate(20);
		car3.decelerate(10);
		assertThat(car3.getSpeed(), is(10));
	}
	
	// Create and pass test for no deceleration below 0.
	
}