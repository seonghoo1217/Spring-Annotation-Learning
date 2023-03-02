# Custom Annotation 사용 예제 레포지토리

## 레포지토리 구현 목표
- 해당 레포지토리는 CustomAnnotation을 제작하여 불필요한 import 제거 및 가독성 증가에 목표를 맞춘 레포지토리입니다.
- 예를 들어 Service Layer에서 자주사용되는 어노테이션으로는 `@Service`,`@Transactional`와 같은 어노테이션이 존재합니다.
  - 이를 간편히 `@EssentialServiceLayer`로 재정의 할 수 있습니다.

### 예제 코드
```java
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Service
@Transactional
public @interface EssentialServiceLayer {
}
```