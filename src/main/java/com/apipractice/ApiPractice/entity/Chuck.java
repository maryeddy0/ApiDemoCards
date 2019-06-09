package com.apipractice.ApiPractice.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Chuck {

		private String type;
		private ArrayList<Value> value;

		
		public Chuck() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Chuck(String type, ArrayList<Value> value) {
			super();
			this.type = type;
			this.value = value;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public ArrayList<Value> getValue() {
			return value;
		}
		public void setValue(ArrayList<Value> value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return "Chuck [type=" + type + ", value=" + value + "]";
		}

}
