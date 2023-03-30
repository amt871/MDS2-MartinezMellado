import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cabecera_usuario_no_registrado')
export class VistaCabecera_usuario_no_registrado extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <vaadin-horizontal-layout style="width: 100%; height: 100%;">
  <vaadin-horizontal-layout style="width: 100%; align-items: center; margin-left: var(--lumo-space-xl);">
   <vaadin-button>
    Inicio
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; justify-content: center; align-items: center;">
   <vaadin-button>
    Busqueda
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; justify-content: flex-end; align-items: center; margin-right: var(--lumo-space-xl);">
   <vaadin-button>
    Iniciar sesion
   </vaadin-button>
   <vaadin-button>
    Registrarse
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
