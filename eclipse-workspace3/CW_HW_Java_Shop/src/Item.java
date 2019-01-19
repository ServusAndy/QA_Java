
public class Item {
		 private String id;
		 private String title;
		 private String category;
		 private double price;
		
		 public Item() {}

		public Item(String id, String title, String category, double price) {
			this.id = id;
			this.title = title;
			this.category = category;
			this.price = price;
		}

		public String getId() {
			return id;
		}

		public String getTitle() {
			return title;
		}

		public String getCategory() {
			return category;
		}

		public double getPrice() {
			return price;
		}

		@Override
		public String toString() {
			return "item [id=" + id + ", title=" + title + ", category=" + category + ", price=" + price + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((category == null) ? 0 : category.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			long temp;
			temp = Double.doubleToLongBits(price);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((title == null) ? 0 : title.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Item other = (Item) obj;
			if (category == null) {
				if (other.category != null)
					return false;
			} else if (!category.equals(other.category))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		};
		 
		
		 
	}
