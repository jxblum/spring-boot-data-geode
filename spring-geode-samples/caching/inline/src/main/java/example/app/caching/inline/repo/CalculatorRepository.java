/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package example.app.caching.inline.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import example.app.caching.inline.model.Operator;
import example.app.caching.inline.model.ResultHolder;

/**
 * Spring Data {@link CrudRepository}, a.k.a. Data Access Object (DAO) used to perform basic CRUD and simple query
 * data access operations on {@link ResultHolder} objects to/from the backend data store.
 *
 * @author John Blum
 * @see org.springframework.data.repository.CrudRepository
 * @see example.app.caching.inline.model.ResultHolder
 * @since 1.1.0
 */
@SuppressWarnings("unused")
// tag::class[]
public interface CalculatorRepository extends CrudRepository<ResultHolder, ResultHolder.ResultKey> {

	Optional<ResultHolder> findByOperandEqualsAndOperatorEquals(Number operand, Operator operator);

}
// end::class[]
