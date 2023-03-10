package data.repositories;

import data.models.Package;

import java.util.List;

public interface IPackageAbleRepository {
	
	Package save(Package thePackage);
	void delete(Package thePackage);
	void delete(int id);
	List<Package> findAll();
	Package findById(int id);
}
