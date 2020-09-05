package com.company;

public class Country {
	private String nameCountry;
	private int creationCountry;
	private String namePathWorld;
	private int areaCountry;
	
	Country(){
	}
	
	Country(String nameCountry, int creationCountry, String namePathWorld, int areaCountry){
		this.nameCountry = nameCountry;
		this.creationCountry = creationCountry;
		this.namePathWorld = namePathWorld;
		this.areaCountry = areaCountry;
	}
	
	Country(Country another){
		this.nameCountry = another.getNameCountry();
		this.creationCountry = another.getCreationCountry();
		this.namePathWorld = another.getNamePathWorld();
		this.areaCountry = another.getAreaCountry();
	}
	
	public void add(String nameCountry, int creationCountry, String namePathWorld, int areaCountry){
		this.nameCountry = nameCountry;
		this.creationCountry = creationCountry;
		this.namePathWorld = namePathWorld;
		this.areaCountry = areaCountry;
	}
	
	public void add(Country another){
		this.nameCountry = another.getNameCountry();
		this.creationCountry = another.getCreationCountry();
		this.namePathWorld = another.getNamePathWorld();
		this.areaCountry = another.getAreaCountry();
	}
	
	public int getAreaCountry() {
		return areaCountry;
	}
	
	public void setAreaCountry(int areaCountry) {
		this.areaCountry = areaCountry;
	}
	
	public int getCreationCountry() {
		return creationCountry;
	}
	
	public void setCreationCountry(int creationCountry) {
		this.creationCountry = creationCountry;
	}
	
	public String getNameCountry() {
		return nameCountry;
	}
	
	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}
	
	public String getNamePathWorld() {
		return namePathWorld;
	}
	
	public void setNamePathWorld(String namePathWorld) {
		this.namePathWorld = namePathWorld;
	}
}
