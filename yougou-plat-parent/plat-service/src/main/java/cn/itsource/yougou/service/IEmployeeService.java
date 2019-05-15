package cn.itsource.yougou.service;

import cn.itsource.yougou.domain.Employee;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IEmployeeService extends IService<Employee> {

    Employee login(String username,String password);
}
