
SET TRANSACTION ISOLATION LEVEL REPEATABLE READ;

SELECT SUM(price) �Ѿ�
FROM   Book;
  

SELECT SUM(price) �Ѿ�
FROM   Book;

/* ���� ����� �ٸ� */
 
COMMIT;
