package data.repositories;

import data.models.Package;

import java.util.ArrayList;
import java.util.List;

public class PackageRepositoryImpl implements IPackageAbleRepository {
	private int count;
	private List<Package> packages = new ArrayList<>();
	
	@Override
	public Package save(Package thePackage) {
		boolean isSaved = thePackage.getPackageId() != 0;
		if (isSaved)
			update(thePackage);
		else saveNewPackage(thePackage);
		
		return thePackage;
	}
	
	private void update(Package thePackage){
//		Package savedPackage = findById(thePackage.getPackageId());
//		int indexOfSavedPackage = packages.indexOf(savedPackage);
//		packages.set(indexOfSavedPackage, thePackage);
		int packageId = thePackage.getPackageId();
		Package savedPackage = findById(packageId);
		packages.remove(savedPackage);
		packages.add(thePackage);
	}
	
	private void saveNewPackage(Package thePackage){
		int id = generatePackageId();
		thePackage.setPackageId(id);
		packages.add(thePackage);
		count+=1;
	}
	@Override
	public Package findById(int id) {
		for (Package thePackage: packages) {
			if (thePackage.getPackageId() == id)
				return thePackage;
		}
		return null;
	}
	
	private int generatePackageId() {
		return count+1;
	}
	
	@Override
	public void delete(Package thePackage) {
	
	}
	
	@Override
	public void delete(int id) {
	
	}
	
	@Override
	public List<Package> findAll() {
		return null;
	}
	
	public long count() {
		return count;
	}
}
