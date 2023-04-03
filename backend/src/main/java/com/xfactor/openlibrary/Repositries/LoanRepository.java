package com.xfactor.openlibrary.Repositries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xfactor.openlibrary.domain.Loan;
public interface LoanRepository extends JpaRepository<Loan, Long> {

    List<Loan> findByBookId(int bookId);

    List<Loan> findByStudentId(int studentId);

    List<Loan> findByCheckoutDate(String checkoutDate);

    List<Loan> findByDueDate(String dueDate);

    List<Loan> findByReturnDate(String returnDate);

}
