import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import './vista-cabecera_usuario_registrado';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: center; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; margin-left: var(--lumo-space-m);">
  <vaadin-button>
    Inicio 
  </vaadin-button>
  <vaadin-button>
    Notificaciones 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; align-items: center;">
  <vaadin-button style="padding: var(--lumo-space-s);">
    Busqueda 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end; align-items: center; margin-right: var(--lumo-space-m);">
  <vista-cabecera_usuario_registrado id="idPublicar"></vista-cabecera_usuario_registrado>
  <vaadin-button>
    Perfil 
  </vaadin-button>
  <vaadin-button theme="icon" aria-label="Add new" id="iconPerfilButon">
   <iron-icon icon="lumo:user"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
