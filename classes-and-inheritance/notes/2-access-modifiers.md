# Access Modifiers

| Modifier | Same class | Same package | Subclass | Other package |
|---|---:|---:|---:|---:|
| `private` | ✓ | ✗ | ✗ | ✗ |
| default | ✓ | ✓ | package-dependent | ✗ |
| `protected` | ✓ | ✓ | ✓ | package/subclass rules |
| `public` | ✓ | ✓ | ✓ | ✓ |

Prefer `private` fields with public methods when practicing encapsulation.
