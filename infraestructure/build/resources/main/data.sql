DROP TABLE IF EXISTS `domain_registry`;

CREATE TABLE `domain_registry` (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  qname VARCHAR(250) NOT NULL,
  qtype VARCHAR(250) NOT NULL,
  content VARCHAR(250) NOT NULL,
  ttl INTEGER NOT NULL
);

insert into domain_registry (qname,qtype,content,ttl)
values('example.com', 'NS', 'ns1.project.com',3600) ;

insert into domain_registry (qname,qtype,content,ttl)
values('example.com', 'NS', 'ns2.project.com',3600) ;

insert into domain_registry (qname,qtype,content,ttl)
values('example.com', 'A', '1.2.3.4',3600) ;

insert into domain_registry (qname,qtype,content,ttl)
values('example.com', 'SOA', 'ns1.project.com. hostmaster.project.com. 2018041355 10800 3600 604800 600',3600) ;