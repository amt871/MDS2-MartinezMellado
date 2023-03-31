import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-icons/vaadin-icons.js';

@customElement('vista-inicio_no_registrado_item')
export class VistaInicio_no_registrado_item extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="" style="width: 100%; height: 100%;">
  <vaadin-vertical-layout style="width: 60%; align-items: flex-start; justify-content: center;">
   <img src="../../resources/icons/video.svg" style="height: 90%;">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 40%; justify-content: center; align-items: center;">
   <img style="height: 20%;" src="../../resources/icons/user.svg">
   <label>Usuario</label>
   <vaadin-horizontal-layout style="width: 100%; justify-content: space-around;">
    <vaadin-horizontal-layout style="width: 100%; justify-content: center; align-items: center;">
     <label>Fecha</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: center;">
     <label>Ubicacion</label>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="margin-bottom: var(--lumo-space-l); margin-top: var(--lumo-space-l); width: 100%; height: 40%; justify-content: center;">
    <label>Descripcion</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="width: 100%;">
    <vaadin-vertical-layout theme="spacing-xs" style="width: 100%; align-items: center;">
     <iron-icon icon="vaadin:heart"></iron-icon>
     <label>Me gustas</label>
     <vaadin-button>
      Ver me gustas
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing-xs" style="width: 100%; align-items: center;">
     <vaadin-button theme="icon" aria-label="Add new">
      <iron-icon icon="vaadin:comments"></iron-icon>
     </vaadin-button>
     <label>Comentarios</label>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
