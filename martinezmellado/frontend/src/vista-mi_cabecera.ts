import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: center; align-items: center; background-color: black;">
 <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: center; background-color: black; align-self: center; height: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-items: center; margin-left: var(--lumo-space-m); height: 100%;">
   <vaadin-button id="bInicio" style="background-color: white; color: black;">
     Inicio 
   </vaadin-button>
   <vaadin-button id="bNotis" style="background-color: white; color: black;">
     Notificaciones 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; align-items: center; height: 100%;">
   <vaadin-button style="background-color: white; color: black;" id="bBusqueda">
     Busqueda 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end; align-items: center; margin-right: var(--lumo-space-m); height: 100%;">
   <vaadin-button id="bPublicar" style="background-color: white; color: black;">
     Publicar 
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="bPerfil" style="background-color: white; color: black;">
    <iron-icon icon="lumo:user"></iron-icon>
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
