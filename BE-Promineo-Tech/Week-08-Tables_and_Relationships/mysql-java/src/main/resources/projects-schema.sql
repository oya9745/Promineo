DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS material;
DROP TABLE IF EXISTS step;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS project_category;

CREATE TABLE project(
	project_id INT NOT NULL,
	project_id_name VARCHAR(128) NOT NULL,
	estimated_hours DECIMAL(7,2),
	actual_hours DECIMAL(7,2),
	difficulty INT,
	notes TEXT,
	primary key (project_id)
	);

CREATE TABLE material (
	material_id INT NOT NULL,
	project_id INT not NULL,
	material_name VARCHAR(128) not null,
	num_required INT,
	cost DECIMAL(7,2),
	primary key (material_id),
	foreign key (project_id) references project (project_id) on delete cascade
	);
	
CREATE TABLE step (
	step_id INT not null,
	project_id int not null,
	step_text text not null,
	step_order int not null,
	primary key (step_id),
	foreign key (project_id) references project (project_id) on delete cascade
);
	
CREATE TABLE category (
	category_id INT NOT NULL,
	category_name VARCHAR(128) NOT null,
	primary key (category_id)
	);

CREATE TABLE project_category (
	project_id INT NOT NULL,
	category_id INT NOT null,
	foreign key (project_id) references project (project_id) on delete cascade,
	foreign key (category_id) references category (category_id) on delete cascade,
	unique key (project_id),
	unique key (category_id)
	
	);
	