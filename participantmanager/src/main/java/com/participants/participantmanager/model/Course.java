package com.participants.participantmanager.model;

import java.util.List;




	public class Course {
		private Long id;
		private String description;
		private String prerequesite;
		private String lastupdated;
		private String feedback;
		private List<Skillentity> skills;
		private List<Creatorentity> creator;
		private String location;

		public Course() {
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPrerequesite() {
			return prerequesite;
		}

		public void setPrerequesite(String prerequesite) {
			this.prerequesite = prerequesite;
		}

		

		

		public String getLastupdated() {
			return lastupdated;
		}

		public void setLastupdated(String lastupdated) {
			this.lastupdated = lastupdated;
		}

		public String getFeedback() {
			return feedback;
		}

		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}

		public List<Skillentity> getSkills() {
			return skills;
		}

		public void setSkills(List<Skillentity> skills) {
			this.skills = skills;
		}

		

		

		public List<Creatorentity> getCreator() {
			return creator;
		}

		public void setCreator(List<Creatorentity> creator) {
			this.creator = creator;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		@Override
		public String toString() {
			return "CourseEntity [id=" + id + ", desc=" + description + ", prerequesite=" + prerequesite + ", lastUpdated="
					+ lastupdated + ", feedback=" + feedback + ", skills=" + skills + ", creator=" + creator + ", location="
					+ location + "]";
		}

}
