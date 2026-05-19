package com.projectx.bank.repo;

import com.projectx.bank.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
//    private JdbcTemplate template;
//
//    public JdbcTemplate getTemplate() {
//        return template;
//    }
//
//    @Autowired
//    public void setTemplate(JdbcTemplate template) {
//        this.template = template;
//    }
//
//
//    public void save(Account account) {
//        String sql = "insert into account (id, name, balance) values (?,?,?)";
//        int i = template.update(sql, account.getId(), account.getName(), account.getBalance());
//        System.out.println("rows : " + i);
//    }
//
//    public List<Account> findAll() {
//        String sql = "Select * from account";
//        RowMapper<Account> mapper = new RowMapper<Account>() {
//            @Override
//            public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Account acc = new Account();
//                acc.setId(rs.getInt(1));
//                acc.setName(rs.getString(2));
//                acc.setBalance(rs.getDouble(3));
//                return acc;
//            }
//        };
//        List<Account> accounts = template.query(sql, mapper);
//        return accounts;
//
//    }
//
//    public Account findById(int id) {
//        String sql = "SELECT * FROM account WHERE id = ?";
//        RowMapper<Account> mapper = new RowMapper<Account>() {
//            @Override
//            public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Account acc = new Account();
//                acc.setId(rs.getInt("id"));
//                acc.setName(rs.getString("name"));
//                acc.setBalance(rs.getDouble("balance"));
//                return acc;
//            }
//        };
//        try {
//            return template.queryForObject(sql, mapper, id);
//        } catch (Exception e) {
//            return null; // 👈 account not found
//        }
//    }
//
//
//    public void updateBalance(int id, double balance) {
//        String sql = "UPDATE account SET balance = ? WHERE id = ?";
//        template.update(sql, balance, id);
//    }


    //END
}