package model;

public class User {
		private int id;
		private String name;
		private String password;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("User [id=");
			builder.append(id);
			builder.append(", name=");
			builder.append(name);
			builder.append(", password=");
			builder.append(password);
			builder.append("]");
			return builder.toString();
		}
		
}
