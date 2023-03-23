import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-mi_cabecera')
export class VistaMi_cabecera extends LitElement {
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
<vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; justify-content: center;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; padding-top: var(--lumo-space-s); padding-left: var(--lumo-space-m);">
  <vaadin-button>
   Inicio
  </vaadin-button>
  <vaadin-button>
   Notificaciones
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; align-items: center; padding-top: var(--lumo-space-s);">
  <vaadin-button style="padding: var(--lumo-space-s);">
   Busqueda
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end; align-items: center; padding-top: var(--lumo-space-s); padding-right: var(--lumo-space-m);">
  <vaadin-button>
   Publicar 
  </vaadin-button>
  <vaadin-button>
   Perfil 
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" id="iconPerfilButon">
   <iron-icon icon="lumo:user"></iron-icon>
  </vaadin-button>Usuario
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
