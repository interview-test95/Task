# Task 1 

<p></p>
1. Fill content of the method ProductService.getAllProductNames() that should return all product names using ProductRepository.findAll().
To test it, please run unit test ProductServiceTest.getAllProductNames_correctNamesReturned() - it must run with success

<p></p>
2. Fill the method ProductService.saveOrUpdateAll(List<ProductEntity> productEntities) to save or update all provided products in parameter, use ProductRepository.saveOrUpdate().
In next step write unit test ProductServiceTest.saveOrUpdateAll() to check your implementation is working correct

<p></p>
3. Create controller ProductController (use annotations from annotation.spring package) to provide REST API for:

* find all products

* save or update Products (list)

* delete product by id (implement missing code)