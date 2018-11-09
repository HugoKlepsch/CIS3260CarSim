package model;

public class SimulationModel implements ISimulatable {

	public CarState carState = null; 
	private long time_ms = 0; 
	
	public void iterateSimulation(long time_ms) {
		this.time_ms = time_ms; 
		//call methods to iterate all car state variables etc. 
		carState.iterateSimulation(time_ms);
	}
	
	public long getTime() {
		return this.time_ms; 
	}
	
	@Override
	public String toString() {
		return "SimulationModel [carState=" + carState + ", time_ms=" + time_ms + "]";
	}

	/* We could have this take arguements for initalization, but that seems greasy */ 
	public SimulationModel() throws NullDataFoundAtBuild {
	
		//If build fails at any point exception is thrown. 
		carState = new CarState.CarStateBuilder()
				/* double:rpm, double:temperature, boolean:isEngineOn */
				.withEngine(1000, 20, true) 
				/* double:speedms, double:directionDegree, double:longitude, double: latitude, double: altitude*/
				.withLocation(100.0, 0.0, 0.0, 0.0, 0.0)
				/* int:totalGears, int:currentGear, boolean:hasReverse */
				.withTransmission(5, 0, false)
				.withGasLevel(100) //double 
				.withFrontWheelDeviation(45) //double
				.withStructuralIntegrity(100) //double
				.build(); 
		
	}
	
}