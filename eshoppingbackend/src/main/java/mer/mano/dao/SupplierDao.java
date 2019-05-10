package mer.mano.dao;

import java.util.List;

import mer.mano.model.Supplier;

public interface SupplierDao 
{
   public boolean addSupplier(Supplier supplier);
   public boolean deleteSupplier(Supplier supplier);
   public boolean updateSupplier(Supplier supplier);
   public Supplier getSupplier(int supplierId);
   public List<Supplier> listSuppliers();
   
}
