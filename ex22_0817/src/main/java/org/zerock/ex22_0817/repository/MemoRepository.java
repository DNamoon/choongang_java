package org.zerock.ex22_0817.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.ex22_0817.entity.Memo;

public interface MemoRepository extends JpaRepository<Memo,Long> {
}
