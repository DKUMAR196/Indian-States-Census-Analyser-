package com.bridgelabz.program;

public class IndianStateCodeCSV {
	@CsvBindByName(column = "State Name", required = true)
    public String State;

    @CsvBindByName(column = "StateCode", required = true)
    public String StateCode;

    @Override
    public String toString() {
        return "IndianStateCodeCSV{" +
                ", state='" + State + '\'' +
                ", StateCode='" + StateCode + '\'' +
                '}';
    }
}


